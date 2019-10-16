package com.example.dagger2example;

import dagger.Component;

/**
 * @Component annotation -->
 * At compile time dagger will implement this interface and create all the necessary code
 * GOOGLE  -> Annotation Processing
 * */
@Component
public interface CarComponent {

    /**
     * From here we get our instantiated car object
     * Component is the most important piece of dagger
     * It is the Backbone of dagger
     *
     * This is where classes like our activity get the object from
     * --> which they want to use
     * The component creates the dependency graph
     * Directed Acyclic Graph
     *
     * Component creates and stores our objects and then provides them to us
     * It can also be called as the INJECTOR
     *
     * There are two ways in which the component can provide the dependencies
     * It can either inject them  into the  member variable of our activity directly
     * Other method is provisional mehtod that is just a simple getter method
     *
     *
     * In Dagger we have compile time verification of our dependency graph
     *
     * */


    /**
     * In order for dagger to instantiate our Car we need to mark all the constructors that it needs to use
     * */
    Car getCar();

}
