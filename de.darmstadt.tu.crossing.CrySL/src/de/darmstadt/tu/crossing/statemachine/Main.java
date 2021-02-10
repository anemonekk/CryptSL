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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.CrySLStandaloneSetup;
import de.darmstadt.tu.crossing.StatemachineRuntimeModule;
import de.darmstadt.tu.crossing.StatemachineStandaloneSetup;
import de.darmstadt.tu.crossing.crySL.CrySLFactory;
import de.darmstadt.tu.crossing.crySL.Domainmodel;
import de.darmstadt.tu.crossing.crySL.Expression;
import de.darmstadt.tu.crossing.crySL.SuperType;
import de.darmstadt.tu.crossing.crySL.impl.CrySLFactoryImpl;
import de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl;
import de.darmstadt.tu.crossing.crySL.impl.SuperTypeImpl;
import de.darmstadt.tu.crossing.scoping.StatemachineScopeProvider;

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
		
		//Maybe needed to do the initialization of the language infrastructure:

	    /*public static void main(String[] args) {
	        Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	        MyApplication application = injector.getInstance(MyApplication.class);
	        application.run();
	    }*/
		
		testSMG();
		
	}
	
	//@Inject
    //private static IScopeProvider scopeProvider;
	
	
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
		
		//set up resource
		
		//May work:
		/*Injector injector = Guice.createInjector(new UserRuntimeModule());
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(getUserFileLocationURI()), true);*/
		/*StatemachineStandaloneSetup statemachineStandaloneSetup = new StatemachineStandaloneSetup();
		final Injector injector = statemachineStandaloneSetup.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// or like this?
		Injector injector2 = Guice.createInjector(new StatemachineRuntimeModule());
		XtextResourceSet resourceSet2 = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);*/
	    
		//next line does: new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration()
		StatemachineStandaloneSetup.doSetup(); 
		
		ResourceSet set = new ResourceSetImpl(); 
		
		final ExtendedMetaData extendedMetaData =
			     new BasicExtendedMetaData(set.getPackageRegistry());
		set.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		
		//URI uri = URI.createFileURI("C:\\Users\\T440s\\git\\CryptSL\\test_stm\\test1e.statemachine");
		URI uri = URI.createPlatformResourceURI("CryptSL\\test_stm\\test13m.statemachine", true); //path unmapped error
		 
		Resource resource = set.createResource(uri);
		System.out.println("uri " + uri);
	    //((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap());
		System.out.println("resource " + resource);
				
		// instantiate objects by using factory class in the same package, create AST objects with relations
		Statemachine statemachine = StatemachineFactory.eINSTANCE.createStatemachine();
		System.out.println(statemachine);
		// ArrayList<CrossReference> crossReferences = null;
		// ICrossReferenceSerializer crossRefSerializer;

		de.darmstadt.tu.crossing.statemachine.State outstate = null;
		StatemachineScopeProvider scopeProvider = new StatemachineScopeProvider();
		System.out.println("scopeProvider: " + scopeProvider);
		
		// new handling of traversing the crysl model to create instances of new statemachine language
		for(TransitionEdge e: myTransitions) {
			// check for duplicate events
			/*if(sameEvent(myTransitions, e)) {
				System.out.println("!!! found event that occurs twice: " + e);
			}*/
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
					outstate = StatemachineFactory.eINSTANCE.createState();
					outstate.setName("testName" + event.getName());
					System.out.println("created node left: " + outstate);
					
			    	statemachine.getStates().add(outstate);
			    	
			    	// remove from list to not have a state twice
			    	Iterator<StateNode> itr = stateNodes.iterator();
			    	while(itr.hasNext()) {
			    	   StateNode element = (StateNode) itr.next();
			    	   if(e.getLeft().equals(element))
			    	   {
			    	       itr.remove();
			    	       break;
			    	   }
			    	}
			    	System.out.println("nodes " + stateNodes);
				}
			}
			
			System.out.println("right " + e.getRight());
			for(StateNode s: stateNodes) {
				if(e.getRight().equals(s)) {
					de.darmstadt.tu.crossing.statemachine.State instate = StatemachineFactory.eINSTANCE.createState();
					instate.setName("testName" + event.getName());
					System.out.println("created node right: " + instate);
					
			    	statemachine.getStates().add(instate);
			    	
			    	// create transition, if both states and event are present since need to set those
			    	System.out.println("create transition ");
					//!!de.darmstadt.tu.crossing.statemachine.Transition transition = StatemachineFactory.eINSTANCE.createTransition();
					//!!System.out.println("created transition: " + transition);
					
					
					// need to define the scope for the event and the state cross references for transition
					//scopeProvider.getScope(outstate, stm.getState_Transitions);
					//System.out.println(stm.StatemachinePackage().getState_Transitions());
					
					//!!transition.setEvent(event);
					//!!transition.setFromState(outstate);
			    	//!!transition.setEndState(instate);
			    	//!!System.out.println("set event and state " + transition + " " + transition.getFromState() + " "+ transition.getEvent() + " " + transition.getEndState());			    	
			    	
			    	//!!instate.getTransitions().add(transition);
			    	//outstate.getTransitions()?
			    	//!!statemachine.getTransitions().add(transition);
			    	
			    	IScope scopeEvent;
			    	IScope scopeState;
			    	IScope scopeTransitionState;
			    	IScope scopeTransitionEvent;
			    	//needs to be done for both cross references, i.e. state and event?
			    	//same error for all three calls
			    	//!!scopeTransitionEvent = scopeProvider.getScope(transition, StatemachinePackage.eINSTANCE.getTransition_Event());
			    	//scopeTransitionState = scopeProvider.getScope(transition, StatemachinePackage.eINSTANCE.getTransition_State());
			    	
			    	//scopeTransitionEvent.getAllElements();
			    	//System.out.println("scope transition event " + scopeTransitionEvent);
			    	//System.out.println("scope transition state " + scopeTransitionState);
			    	
			    	//scope = scopeProvider.getScope(instate, StatemachinePackage.eINSTANCE.getTransition_State());
			    	//System.out.println("scopeEvent is: " + scopeEvent);
			    	//System.out.println("scopeState is: " + scopeState);
			    	
			    	// remove from list			    	
			    	Iterator<StateNode> itr = stateNodes.iterator();
			    	while(itr.hasNext()) {
				    	   StateNode element = (StateNode) itr.next();
				    	   if(e.getRight().equals(element))
				    	   {
				    	       itr.remove();
				    	       break;
				    	   }
				    	}

				    System.out.println("nodes " + stateNodes);
				    outstate = instate; //needs enhancement for more specific rules, hardcoded for Cookie.crysl
				}
			}
		}

		System.out.println("events: " + statemachine.getEvents());
		System.out.println("states: " + statemachine.getStates());
		//System.out.println("transitions: " + statemachine.getTransitions());
		for(Transition t: statemachine.getTransitions()) {
			System.out.println("transitions: " + t.getFromState() + " " + t.getEndState() + " " + t.getEvent());
		}
		
		
		// serialize cross reference transition
		//CrossReference crossReference = new CrossReference(transition);		
		CrossReferenceSerializer crossRefSerializer2 = new CrossReferenceSerializer();
		//crossRefSerializer.serializeCrossRef(semanticObject, crossref, target, node, errors)
		
		
		// save
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
		
        System.out.println("saved to " + uri);
        
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
	
	//method for adding flag to events that occur more often
		public static boolean sameEvent(List<TransitionEdge> edges, TransitionEdge e) {
			int counter = 0;
			System.out.println("inside sameEvent with" + e);
			for(TransitionEdge ed: edges) {
				if(ed.getLabel().equals(e.getLabel())) {
					counter++;
				}
			}
			System.out.println("counter: " + counter);
			if(counter > 1) {
				return true;
			}
			return false;
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