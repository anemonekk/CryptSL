package de.darmstadt.tu.crossing.statemachine;

import java.io.ByteArrayOutputStream;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Provider;

import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.CrySLStandaloneSetup;
import de.darmstadt.tu.crossing.StatemachineStandaloneSetup;
import de.darmstadt.tu.crossing.crySL.CrySLFactory;
import de.darmstadt.tu.crossing.crySL.Domainmodel;
import de.darmstadt.tu.crossing.crySL.Expression;
import de.darmstadt.tu.crossing.crySL.SuperType;
import de.darmstadt.tu.crossing.crySL.impl.CrySLFactoryImpl;
import de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl;
import de.darmstadt.tu.crossing.crySL.impl.SuperTypeImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.darmstadt.tu.crossing.statemachine.Statemachine;
import de.darmstadt.tu.crossing.statemachine.StatemachineFactory;

import org.eclipse.xtext.resource.IResourceFactory;

public class Main {
	
	//private List<String> mystates = new ArrayList<String>();

	public static void main(String[] args) throws MalformedURLException  {
		// TODO Auto-generated method stub
		
		//stateFctn("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");
		/*List<String> myTransitionLabels = myEventLabel();
		ArrayList<Event> myTransitions = myEvent();
		if(myTransitions != null)
			System.out.println("The objectss are: " + myTransitions.get(0) + " and " + myTransitions.get(1));
		 */
		
		testSMG();
		
	}
	
	public static void testSMG() {
    	System.out.println("------------------invoking smg--------------------");
    
    	// to be exchanged by self in Sirius
    	EObject self = null;
		try {
			self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");
			//self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\KeyGenerator.crysl");
	    	//EObject self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
    	
    	final Domainmodel dm = (Domainmodel) self;
		Expression order = dm.getOrder();
    	
    	StateMachineGraph smgb = new StateMachineGraphBuilder(order).buildSMG();
    	Set<StateNode> stateNodes = smgb.getNodes();
    	List<TransitionEdge> myTransitions = smgb.getEdges();
    	List<Event> myTransitionEvents = new ArrayList<Event>(); // only for labels as they do not provide info what is source and target
    	Collection<TransitionEdge> transitions = smgb.getAllTransitions();	
    	
    	for(TransitionEdge e : myTransitions) {
    		myTransitionEvents.add(e.getLabel());
    	}
		
		System.out.println("nodes: " + stateNodes);
		System.out.println("transitions: " + transitions);
		System.out.println("myTransitions: " + myTransitions);
		System.out.println("myTransitionEvents: " + myTransitionEvents);
		
		//code to create file
		
		StatemachineStandaloneSetup.doSetup();
		
		// instantiate objects by using factory class in the same package
		Statemachine statemachine = StatemachineFactory.eINSTANCE.createStatemachine();
		System.out.println(statemachine);
		
		// test set of integers, remove working
		Set<Integer> setTest = new HashSet<Integer>();
		System.out.println("setTest " + setTest);
		setTest.add(1);
		System.out.println("setTest " + setTest);
		setTest.add(2);
		System.out.println("setTest " + setTest);
		setTest.remove(1);
		System.out.println("setTest " + setTest);
		
		// new handling
		for(TransitionEdge e: myTransitions) {
			System.out.println("create AST objects with relations.");
			de.darmstadt.tu.crossing.statemachine.Event event = null;
	    	if(e.getLabel() instanceof SuperType) {
	    		SuperType ev = (SuperType) e.getLabel();
				System.out.println("create event");
		    	event = StatemachineFactory.eINSTANCE.createEvent();
	    		event.setName(((SuperType) ev).getName());
	    		event.setCode(((SuperType) ev).getName());
		    	System.out.println("created event: " + event);
		    	statemachine.getEvents().add(event);
	    	}
			System.out.println("left " + e.getLeft());
			for(StateNode s: stateNodes) {
				if(e.getLeft().equals(s)) {
					System.out.println("first " + e.getLeft());
					System.out.println("create node");
					de.darmstadt.tu.crossing.statemachine.State outstate = StatemachineFactory.eINSTANCE.createState();
					outstate.setName("testName");
					System.out.println("created node: " + outstate);
					
			    	statemachine.getStates().add(outstate);
			    	Boolean b = false; 
			    	// remove from list to not have a state twice
			    	for(StateNode n: stateNodes) {
						if(e.getLeft().equals(n)) {
							System.out.println("want to remove " + n);
							//stateNodes.add(new StateNode("test")); //adding works
							
							b = stateNodes.remove(n);
						}
			    	}
			    	System.out.println("nodes " + stateNodes);
				}
			}
			
			//do not know why contains won't work
			StateNode node1 = e.getLeft();
			Boolean b1 = stateNodes.contains(node1);
			if(b1) {
				System.out.println("first " + e.getLeft());
				System.out.println("create node");
				de.darmstadt.tu.crossing.statemachine.State outstate = StatemachineFactory.eINSTANCE.createState();
				outstate.setName("testName");
				System.out.println("created node: " + outstate);
				
		    	statemachine.getStates().add(outstate);
		    	//still have to remove from list
		    	stateNodes.remove(e.getLeft());
			}
			
			System.out.println("right " + e.getRight());
			for(StateNode s: stateNodes) {
				if(e.getRight().equals(s)) {
					de.darmstadt.tu.crossing.statemachine.State instate = StatemachineFactory.eINSTANCE.createState();
					instate.setName("testName");
					System.out.println("created node: " + instate);
					
			    	statemachine.getStates().add(instate);
			    	
			    	// create transition, if both states and event are present since need to set those
					de.darmstadt.tu.crossing.statemachine.Transition transition = StatemachineFactory.eINSTANCE.createTransition();
				    transition.setEvent(event);
			    	transition.setState(instate);
			    	System.out.println("set event and state " + transition + " " + transition.getEvent() + " " + transition.getState());
			    	instate.getTransitions().add(transition);
			    	
			    	// remove from list
			    	for(StateNode n: stateNodes) {
						if(e.getRight().equals(n)) {
							System.out.println("want to remove " + n);
							stateNodes.remove(n);
						}
			    	}
			    	System.out.println("nodes " + stateNodes);
				}
			}
					
			//does not work reliably		
			/*if(stateNodes.contains(e.getRight())) {
			    System.out.println("second " + e.getRight());
				System.out.println("create node");
				de.darmstadt.tu.crossing.statemachine.State instate = StatemachineFactory.eINSTANCE.createState();
				instate.setName("testName");
				System.out.println("created node: " + instate);
				
		    	statemachine.getStates().add(instate);
		    	
		    	// create transition, if both states and event are present since I need to set those
				de.darmstadt.tu.crossing.statemachine.Transition transition = StatemachineFactory.eINSTANCE.createTransition();
			    System.out.println("created transition: " + transition);
			    transition.setEvent(event);
		    	transition.setState(instate);
		    	System.out.println("set event and state " + transition + " " + transition.getEvent() + " " + transition.getState());
		    	instate.getTransitions().add(transition);
		    	
		    	//still have to remove from list
		    	stateNodes.remove(e.getRight());
			}*/
			
			
		}
		
		/*for(TransitionEdge e : myTransitions) {
	 		//System.out.println("stm events" + stm.getEvents().add(e));
	    	//event.setName(e.getLabel().ge);
	    	if(e.getLabel() instanceof SuperType) {
	    		SuperType ev = (SuperType) e.getLabel();
				System.out.println("create event");
		    	de.darmstadt.tu.crossing.statemachine.Event event = StatemachineFactory.eINSTANCE.createEvent();
	    		event.setName(((SuperType) ev).getName());
	    		event.setCode(((SuperType) ev).getName());
		    	System.out.println("created event: " + event);
		    	System.out.println("created event name: " + event.getName());
		    	System.out.println("created event code: " + event.getCode());
		    	statemachine.getEvents().add(event);
	    	}
	     }
	     for(StateNode n : stateNodes) {
	    	System.out.println("create node");
	    	de.darmstadt.tu.crossing.statemachine.State state = StatemachineFactory.eINSTANCE.createState();
	 		//System.out.println("stm states" + stm.getStates().add(n));
	    	//statemachineResource.getContents().add(state);
	    	//state.setName(n.getName()); //ValueConverterException, look at that later
	    	state.setName("testName");
	    	System.out.println("created node: " + state);
	    	System.out.println("created node name: " + state.getName());
	    	
	    	de.darmstadt.tu.crossing.statemachine.Transition transition = StatemachineFactory.eINSTANCE.createTransition();
		    System.out.println("created transition: " + transition);
	    	
	    	statemachine.getStates().add(state); // 3 states added
	     }
	     for(/*TransitionEdge i : myTransitions*/ /*int i = 0; i < statemachine.getEvents().size(); i++) {
	    	de.darmstadt.tu.crossing.statemachine.Transition transition = StatemachineFactory.eINSTANCE.createTransition();
		    System.out.println("created transition: " + transition);
		    // get source
		    //System.out.println("src is " + i.getLeft());
		    //System.out.println("target is " + i.getRight());
		    // if(state is left)
		    
	    	// this handling needs enhancement! Only hardcoded here, no correct mapping yet
		    transition.setEvent(statemachine.getEvents().get(i));
	    	transition.setState(statemachine.getStates().get(i));
	    	System.out.println("set event and state " + transition + " " + transition.getEvent() + " " + transition.getState());
	    	
		     for(int j = 0; j < statemachine.getStates().size(); j++) {
		    	 System.out.println("state: " + j);
		    	 statemachine.getStates().get(j).getTransitions().add(transition);
		     }
	     }*/

		System.out.println("events: " + statemachine.getEvents());
		System.out.println("states: " + statemachine.getStates());
		for(State s: statemachine.getStates()) {
			System.out.println("transitions: " + s.getTransitions());
		}
		
		
		//set up resource before serialization 
	    
		ResourceSet set = new ResourceSetImpl(); 
		URI uri = URI.createFileURI("C:\\Users\\T440s\\Desktop\\test_stm\\test11.statemachine");
		//Resource resource = set.createResource(URI.createFileURI("C:\\Users\\T440s\\Desktop\\test_stm\\test10.statemachine")); 
		Resource resource = set.createResource(uri);
	    //((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap());
		System.out.println("resource " + resource);
		resource.getContents().add(statemachine);
		System.out.println(resource);
		System.out.println("content: " + resource.getContents().get(0)); // resource only stores parent
		for(int i = 0; i < statemachine.eContents().size(); i++) {
			System.out.println("contents: " + statemachine.eContents().get(i));
		}
		
		System.out.println("before save");
		/*try {
			resource.save(null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		//class cast exception
		/*Map saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
	    saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
	    saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
	    try {
	        resource.save(saveOptions);
	     } 
	    catch (IOException e) {
	        throw new RuntimeException(e);
	     }	*/
	    
	    final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
        saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

        try {
            resource.save(saveOptions);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	    // use the generated serializer for formatting a single model element
	     
		//Xtext serialization
        //this does not yet do anything
		/*StatemachineStandaloneSetup statemachineStandaloneSetup = new StatemachineStandaloneSetup();
		System.out.println(statemachineStandaloneSetup);
		final Injector injector = statemachineStandaloneSetup.createInjectorAndDoEMFRegistration();
		System.out.println(injector);
		Serializer serializer = injector.getInstance(Serializer.class); 
		System.out.println(serializer);
		String s = serializer.serialize(statemachine);
		System.out.println(s);*/
		
		
		/*ResourceSet rs = new ResourceSetImpl();
	    Resource statemachineResource = createAndAddResource("C:\\Users\\T440s\\Desktop\\test_stm\\test8.statemachine", new String[] {"statemachine"}, rs);

	    Statemachine stm = StatemachineFactory.eINSTANCE.createStatemachine();  
	     for(Event e : myTransitionEvents) {
	    	 de.darmstadt.tu.crossing.statemachine.Event event = StatemachineFactory.eINSTANCE.createEvent();
	    	 //event.set
	     }
	     for(StateNode n : stateNodes) {
	    	 de.darmstadt.tu.crossing.statemachine.State state = StatemachineFactory.eINSTANCE.createState();
	    	 statemachineResource.getContents().add(state);
	     }
	    statemachineResource.getContents().add(stm);
	    saveResource(statemachineResource);
		
		// code to create EObject by having a file path
		// Loading model
		//StatemachineStandaloneSetup statemachineStandaloneSetup = new StatemachineStandaloneSetup();
		//System.out.println(statemachineStandaloneSetup);
		//final Injector injector = statemachineStandaloneSetup.createInjectorAndDoEMFRegistration();
		System.out.println(injector);
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		System.out.println(resourceSet);
		String a = System.getProperty("java.class.path");
		String[] l = a.split(";");
		URL[] classpath = new URL[l.length];
		for (int i = 0; i < classpath.length; i++) {
			classpath[i] = new File(l[i]).toURI().toURL();
		}
		System.out.println(classpath);
		URLClassLoader ucl = new URLClassLoader(classpath);
		resourceSet.setClasspathURIContext(new URLClassLoader(classpath));
		new ClasspathTypeProvider(ucl, resourceSet, null, null);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		*/
	}
	
	// helper methods for resource creation and resource saving XML
		public static Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
		     for (String fileext : fileextensions) {
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		     }		
		     URI uri = URI.createFileURI(outputFile);
		     Resource resource = rs.createResource(uri);
		     ((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap());
		     return resource;
		}
		
		public static void saveResource(Resource resource) {
		     Map saveOptions = ((XMLResource)resource).getDefaultSaveOptions();
		     saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		     saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
		     try {
		        resource.save(saveOptions);
		     } catch (IOException e) {
		        throw new RuntimeException(e);
		     	}	
		}
		
		public static Resource createAndAddResourceXtext(String outputFile, String[] fileextensions, XtextResourceSet rs) {
		     for (String fileext : fileextensions) {
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new ResourceFactoryImpl());
		     }		
		     URI uri = URI.createFileURI(outputFile);	    
		     //XtextResource resource = (XtextResource) rs.createResource(uri); //class cast exception
		     ResourceImpl resource = (ResourceImpl) rs.createResource(uri);
		     //XtextResource xr = (XtextResource) resource;
		     // here class cast, but why??
		     XtextResource xc = (XtextResource) resource;
		     ((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap());
		     return resource;
		}

		public static void saveResourceXtext(XtextResource resource) {
			 SaveOptions saveOpt = null;
			 //saveOpt.addTo((XtextResource) resource.save(saveOpt););
		     //Map saveOptions = ((XMLResource)resource).getDefaultSaveOptions();
		     //saveOpt.toOptionsMap();
		     saveOpt.defaultOptions();
		     ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		     
		     //saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		     //saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
		     try {
		       // resource.save(saveOptions);
		    	 resource.doSave(outputStream, null);
		     } 
		     catch (IOException e) {
		        throw new RuntimeException(e);
		     }	
		}
	
	public static EObject giveEObject(String pathToCryslFile) throws MalformedURLException {
		// Loading model
    	CrySLStandaloneSetup crySLStandaloneSetup = new CrySLStandaloneSetup();
		final Injector injector = crySLStandaloneSetup.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		String a = System.getProperty("java.class.path");
		String[] l = a.split(";");
		URL[] classpath = new URL[l.length];
		for (int i = 0; i < classpath.length; i++) {
			classpath[i] = new File(l[i]).toURI().toURL();
		}
		URLClassLoader ucl = new URLClassLoader(classpath);
		resourceSet.setClasspathURIContext(new URLClassLoader(classpath));
		new ClasspathTypeProvider(ucl, resourceSet, null, null);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final Resource resource = resourceSet.getResource(URI.createFileURI(pathToCryslFile), true);
		final EObject eObject = resource.getContents().get(0);
		return eObject;
	}
	
	
	
	public static ArrayList<Event> myEvent(/*Expression self*/) throws MalformedURLException {
    	
    	//System.out.println(self.getClass().getCanonicalName());
    	//if(self instanceof de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl) {
    		//de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl expr = (de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl) self;
    		//EList<Event> orderEv = ((OrderImpl) self).getOrderEv();
        	/*for(Event ev : orderEv) {
        		mystates.add(ev.toString());
        	}*/
    	//}    	
    
    	// to be exchanged by self in Sirius
    	EObject self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");

    	ArrayList<Event> myTransitions = new ArrayList<Event>();
    	final Domainmodel dm = (Domainmodel) self;
		Expression order = dm.getOrder();
		
		System.out.println("-----------------print event objects--------");
		ExpressionImpl implLeft = (ExpressionImpl)order.getLeft();
		EList<Event> orderEvLeft = implLeft.getOrderEv();
		String name = ((SuperTypeImpl)orderEvLeft.get(0)).getName();
		ExpressionImpl implRight = (ExpressionImpl)order.getRight();
		EList<Event> orderEvRight = implRight.getOrderEv();
		if(!orderEvLeft.isEmpty())
			myTransitions.add(orderEvLeft.get(0));
		if(!orderEvRight.isEmpty())
			myTransitions.add(orderEvRight.get(0));
    	
    	return myTransitions;
    }
	
	public static List<String> stateFctn(String pathToCryslFile) throws MalformedURLException {
		CrySLStandaloneSetup crySLStandaloneSetup = new CrySLStandaloneSetup();
		final Injector injector = crySLStandaloneSetup.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		String a = System.getProperty("java.class.path");
		String[] l = a.split(";");

		URL[] classpath = new URL[l.length];
		for (int i = 0; i < classpath.length; i++) {
			classpath[i] = new File(l[i]).toURI().toURL();
		}

		URLClassLoader ucl = new URLClassLoader(classpath);
		resourceSet.setClasspathURIContext(new URLClassLoader(classpath));
		new ClasspathTypeProvider(ucl, resourceSet, null, null);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final Resource resource = resourceSet.getResource(URI.createFileURI(pathToCryslFile), true);
		final EObject eObject = resource.getContents().get(0);
		final Domainmodel dm = (Domainmodel) eObject;
		Expression order = dm.getOrder();
		
		System.out.println("SmgBuilder");
		Expression e = null;
		StateMachineGraph smgb = new StateMachineGraphBuilder(e).buildSMG();
		
		ExpressionImpl implLeft = (ExpressionImpl)order.getLeft();
		EList<Event> orderEvLeft = implLeft.getOrderEv();
		String name = ((SuperTypeImpl)orderEvLeft.get(0)).getName();
		System.out.println("Left event iss " + name);
		ExpressionImpl implRight = (ExpressionImpl)order.getRight();
		EList<Event> orderEvRight = implRight.getOrderEv();
		String name2 = ((SuperTypeImpl)orderEvRight.get(0)).getName();
		System.out.println("Right event is " + name2);
		ArrayList<String> states = new ArrayList<String>();
		states.add(name);
		states.add(name2);
		return states;
	}
	
	private static List<String> getStates(EObject eObject) {
		final Domainmodel dm = (Domainmodel) eObject;
		Expression order = dm.getOrder();
		ExpressionImpl implLeft = (ExpressionImpl)order.getLeft();
		EList<Event> orderEvLeft = implLeft.getOrderEv();
		String name = ((SuperTypeImpl)orderEvLeft.get(0)).getName();
		System.out.println("Left event is " + name);
		ExpressionImpl implRight = (ExpressionImpl)order.getRight();
		EList<Event> orderEvRight = implRight.getOrderEv();
		String name2 = ((SuperTypeImpl)orderEvRight.get(0)).getName();
		System.out.println("Right event is " + name2);
		ArrayList<String> states = new ArrayList<String>();
		states.add(name);
		states.add(name2);
		return states;
	}
	
	public static List<String> myEventLabel(/*Expression self*/) throws MalformedURLException {
    	
    	//System.out.println(self.getClass().getCanonicalName());
    	//if(self instanceof de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl) {
    		//de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl expr = (de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl) self;
    		//EList<Event> orderEv = ((OrderImpl) self).getOrderEv();
        	/*for(Event ev : orderEv) {
        		mystates.add(ev.toString());
        	}*/
    	//}    	
    
    	// to be exchanged by self in Sirius
    	EObject self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");

    	ArrayList<String> myTransitions = new ArrayList<String>();
    	//Working:
    	final Domainmodel dm = (Domainmodel) self;
		Expression order = dm.getOrder();
		
		System.out.println("-----------------print transition labels--------");
		ExpressionImpl implLeft = (ExpressionImpl)order.getLeft();
		EList<Event> orderEvLeft = implLeft.getOrderEv();
		String name = ((SuperTypeImpl)orderEvLeft.get(0)).getName();
		//System.out.println("Left event is " + name);
		ExpressionImpl implRight = (ExpressionImpl)order.getRight();
		EList<Event> orderEvRight = implRight.getOrderEv();
		String name2 = ((SuperTypeImpl)orderEvRight.get(0)).getName();
		//System.out.println("Right event is " + name2);
		//ArrayList<String> states = new ArrayList<String>();
		myTransitions.add(name);
		myTransitions.add(name2);
    	
    	return myTransitions;
    }

	
}