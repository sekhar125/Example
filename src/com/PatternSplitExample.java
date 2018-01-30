package com;


public class PatternSplitExample {

    public static void main(String[] args) {
        
       /* String classCodePattren1 = "[0-9A-Z][0-9A-Z][0-9A-Z][0-9A-Z][0-9A-Z]-[0-9A-Z][0-9A-Z]";
        boolean isClassCode1 = Pattern.matches(classCodePattren1, "A3213-00");
        System.out.print(isClassCode1);
        String classCodePattren2 = "[0-9A-Z][0-9A-Z][0-9A-Z][0-9A-Z][0-9A-Z]";
        boolean isClassCode2 = Pattern.matches(classCodePattren2, "53213");
        System.out.print(isClassCode2);*/
    	String companyId="00005303030";
    	try {
            Integer intVal = Integer.parseInt(companyId);
            companyId = intVal.toString();
        } catch (Exception ex) {
            // whatever
        }

    	System.out.print(companyId);
    }
}
