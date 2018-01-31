package com.java.general;

public class DifferentAccessModifierTest {

	public static void main(String[] args) {
		DifferentAccessModifier dam= new DifferentAccessModifier();
		dam.publicMethod();
		dam.defaultMethod();
		dam.protectedMethod();

	}

}
