package categories.creational.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Write a description of class SingletonLazyTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingletonLazyTest
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("SingletonLazyTest ==> instanceOne Start");
        SingletonLazy instanceOne = SingletonLazy.getInstance();
        System.out.println("SingletonLazyTest ==> instanceOne Done");

                
        System.out.println("SingletonLazyTest ==> instanceTwo Start");
        SingletonLazy instanceTwo = SingletonLazy.getInstance();
        System.out.println("SingletonLazyTest ==> instanceTwo Done");
        
                
        System.out.println("SingletonLazyTest ==> instanceOne hashCode ="+instanceOne.hashCode());
        System.out.println("SingletonLazyTest ==> instanceTwo hashCode ="+instanceOne.hashCode());
        
    }
}
