package com.kh.operator.run;
import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_Indecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparsion;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_TripleOper;

public class Run {
	public static void main(String[] args) {
		A_LogicalNegation al=new A_LogicalNegation();
//		al.method();
		B_Indecrease bl=new B_Indecrease();
//		bl.method4();
		C_Arithmetic cl =new C_Arithmetic();
//		cl.quiz();
		D_Comparsion dl=new D_Comparsion();
//		dl.method1();
		E_Logical El= new E_Logical();
//		El.method5();
		F_Compound fc= new F_Compound();
//		fc.method2();
		G_TripleOper gt= new G_TripleOper();
		gt.method6();
	}
	
}
