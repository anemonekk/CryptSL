package de.darmstadt.tu.crossing.statemachine;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.darmstadt.tu.crossing.crySL.Event;
import de.darmstadt.tu.crossing.CrySLStandaloneSetup;
import de.darmstadt.tu.crossing.crySL.CrySLFactory;
import de.darmstadt.tu.crossing.crySL.Domainmodel;
import de.darmstadt.tu.crossing.crySL.Expression;
import de.darmstadt.tu.crossing.crySL.impl.CrySLFactoryImpl;
import de.darmstadt.tu.crossing.crySL.impl.ExpressionImpl;
import de.darmstadt.tu.crossing.crySL.impl.SuperTypeImpl;

public class Main {
	
	private List<String> mystates = new ArrayList<String>();
	//private static List<String> myGlobalTransitions = new ArrayList<String>();

	public static void main(String[] args) throws MalformedURLException  {
		// TODO Auto-generated method stub
		
		
		//stateFctn("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");
		/*List<String> myTransitionLabels = myEventLabel();
		for(String i : myTransitionLabels) {
			System.out.println("in myTransitions is: " + i);
		}
		ArrayList<Event> myTransitions = myEvent();
		if(myTransitions != null)
			System.out.println("The objectss are: " + myTransitions.get(0) + " and " + myTransitions.get(1));
		 */
		
		testSMG();
		
	}
	
	
	public static void testSMG() throws MalformedURLException {
    	System.out.println("------------------invoking smg--------------------");
    
    	// to be exchanged by self in Sirius
    	EObject self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");
    	//EObject self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");
    	//EObject self = giveEObject("C:\\Users\\T440s\\git\\Crypto-API-Rules\\JavaCryptographicArchitecture\\src\\Cookie.crysl");

    	
    	ArrayList<Event> myTransitions = new ArrayList<Event>();
    	final Domainmodel dm = (Domainmodel) self;
		Expression order = dm.getOrder();
		
		StateMachineGraph smgb = new StateMachineGraphBuilder(order).buildSMG();
		Set<StateNode> stateNodes = smgb.getNodes();
		Collection<TransitionEdge> transitions = smgb.getAllTransitions();
		
		System.out.println("nodes: " + stateNodes);
		System.out.println("transitions: " + transitions);
		
		// sample code for EMF transformation
		
		// these two lines probably correspond to other project
		//Restriction newRestriction = TmdslFactory.eINSTANCE.createRestriction();
        //newRestriction.getRestrictions().add(key);
        
        ResourceSet rs = new ResourceSetImpl();
        // create URI for new model?
        //URI outUri = URI.createURI(model.eResource().getURI().trimSegments(1) +"/"+"test.mag");
        URI outUri = URI.createURI(self.eResource().getURI().trimSegments(1) +"/"+"test.statemachine");
        Resource outResource = rs.createResource(outUri);
        
        // this createModel method is specific to their threatModeling factory
        //de.uni_paderborn.swt.threatModeling.mag.Model magModel = MagFactory.eINSTANCE.createModel();
        EObject model;
        CrySLFactory factory = new CrySLFactoryImpl();
        //System.out.println("create order " + factory.eINSTANCE.createOrder()); //not what I need
        factory.
        
        //magModel.setRestriction(newRestriction);
        
        /*for (List<EObject> list : map.get(key)) {
            AssumptionList assumptionList = MagFactory.eINSTANCE.createAssumptionList();
            assumptionList.getAssumptions().addAll(list);
            magModel.getAssumptions().add(assumptionList);
            outResource.getContents().add(assumptionList);
        }

        outResource.getContents().add(newRestriction);
        outResource.getContents().add(magModel);
		*/
    	
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
    	System.out.println("------------------invoking myString service--------------------");
    	String v = "whatever";
    	
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
		System.out.println("jijio");
		//System.out.println("smg build is: " + smgb.toString());
		//StateMachineGraph s;
		//StateMachineGraphBuilder sb;
		
		
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
    	System.out.println("------------------invoking myString service--------------------");
    	String v = "whatever";
    	
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


	
	






