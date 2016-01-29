package org.campus02.emp;

public class OrganigramHandler {
	
	
	public static String getChainOfCommand(Employee employee) {
		String chain = employee.getName()  
							+ " ["+employee.getRole()+ "]";
		if(employee.getSuperior() == null) {
			return chain;
		}
		return chain + " -> " + getChainOfCommand(employee.getSuperior());
	}
		
	public static String processHierarchy(Employee emp, String indent) {
		if(emp.getSubordinates().size() == 0) {
			return indent + " - " + emp.getRole() + " [" + emp.getName() + "]\n";
		} 
		String result = indent + " + " + emp.getRole() + " (" + emp.getName() + ")\n";
		indent += "   ";
		for(Employee e : emp.getSubordinates()) {		
			result += processHierarchy(e, indent);
		}
		return result;
	}

}
