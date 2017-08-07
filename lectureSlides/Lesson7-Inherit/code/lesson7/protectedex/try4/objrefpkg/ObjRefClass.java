package lesson7.protectedex.try4.objrefpkg;

import lesson7.protectedex.try4.superpkg.SuperClass;

public class ObjRefClass extends SuperClass {
	//override the protected method in SuperClass 
	public String getVal() {
		return "val obj";
	}
}
