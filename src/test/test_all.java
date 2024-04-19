package test;

import org.junit.Test;

import main.PLp1;

import static org.junit.Assert.assertEquals;


public class test_all {
    @Test
    public void funcTest1() {
        assertEquals(PLp1.interpret("function f() { 1 } f->()"), "1");
    }

    @Test
    public void funcTest2() {
        assertEquals(PLp1.interpret("function f(x) { if (x==0) then 0 else x + (f->(x-1)) endif } f->(4)"), "10");
    }

    @Test
    public void funcTest3() {
        assertEquals(PLp1.interpret("function f(x) { if (x==0) then true else g->(x-1) endif } function g(x) { if (x==0) then false else f->(x-1) endif } f->(3)"), "false");
    }
    //function f(x) { if (x==0) then true else g->(x-1) endif } function g(x) { if (x==0) then false else f->(x-1) endif } f->(3)
    @Test
    public void funcTest4() {
        assertEquals(PLp1.interpret("function f(x) { let ([y 7]) { x + y }} f->(4)"), "11");
    }


    @Test
    public void funcTest5() {
        assertEquals(PLp1.interpret("function f(L,x) { switch { case emptyp->(L): 0 case first->(L) == x: (f->(rest->(L),x)) + 1 default : f->(rest->(L),x)}} f->([1,2,3,2,4,5,2],2)"), "3");
    }
    //function f(L,x) { switch { case emptyp->(L): 0 case first->(L) == x: (f->(rest->(L),x)) + 1 default : f->(rest->(L),x)}} f->([1,2,3,2,4,5,2],2)
    
    @Test
    public void lambdaTest1() {
        assertEquals(PLp1.interpret("(lambda () { 1 })->()"), "1");
    }

    @Test
    public void lambdaTest2() {
        assertEquals(PLp1.interpret("(lambda (x) { x })->(5)"), "5");
    }

    @Test
    public void lambdaTest3() {
        assertEquals(PLp1.interpret("(lambda (x,y,z) { x + y + z })->(5,6,7)"), "18");
    }

    @Test
    public void lambdaTest4() {
        assertEquals(PLp1.interpret("(lambda (x,y,z) { (lambda (x,y) { x + y + z })->(10,12) })->(5,6,7)"), "29");
    }

    @Test
    public void lambdaTest5() {
        assertEquals(PLp1.interpret("(lambda (x) { (lambda (y) { x + y })->(6) })->(5)"), "11");
    }

    @Test
    public void lambdaTest6() {
        assertEquals(PLp1.interpret("(lambda (x) { (lambda (y) { x + ((lambda (y) { x + y })->(7)) })->(6) })->(5)"), "17");
    }

    @Test
    public void letTest1() {
        assertEquals(PLp1.interpret("(let () { 1 })->()"), "1");
    }

    @Test
    public void letTest2() {
        assertEquals(PLp1.interpret("let ([x 4]) { x }"), "4");
    }

    @Test
    public void letTest3() {
        assertEquals(PLp1.interpret("let ([x 5] [y 7]) {x + y}"), "12");
    }

    @Test
    public void letTest4() {
        assertEquals(PLp1.interpret("let ([x 4] [y 7] [z 10]) { let ([x 3] [y 10]) { x + y + z}}"), "23");
    }

    @Test
    public void letTest5() {
        assertEquals(PLp1.interpret("let ([x 4]) { let ([y 10]) { let ([z 15]) { x + y + z }}}"), "29");
    }

    @Test
    public void letTest6() {
        assertEquals(PLp1.interpret("let ([x let ([y 3]) { y + 7 }] [z let ([y 4]) { y + 7 }]) { let ([y (x + z)]) { x + y + z}}"), "42");
    }

}