package com.barisaydgdu.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate called");
        testMethod();
        System.out.println(math(4,9));
        System.out.println(newMethod("Baris"));

        username = "";

        makeMusicians();

        makeSimpsons();


    }

    public void makeSimpsons (){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());
    }

    public void makeMusicians(){

        //instance

        Musicians james = new Musicians("james","Guitar",50);
        System.out.println(james.instrument);

    }

    public void testMethod() {

        username = "Lars";


        int x = 4 + 4 ;
        System.out.println("'value of x : " + x );


    }
    public int math(int a , int b){

        username = "Kirk";

        return a + b;
    }
    public String newMethod(String string){

        username = "Rob";

        return string + " is New Method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume called");


    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause called");


    }
}