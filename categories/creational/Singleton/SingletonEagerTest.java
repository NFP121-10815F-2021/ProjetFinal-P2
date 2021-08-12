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
 * Write a description of class SingletonEagerTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingletonEagerTest
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("SingletonEagerTest ==> instanceOne Start");
        SingletonEager instanceOne = SingletonEager.getInstance();
        System.out.println("SingletonEagerTest ==> instanceOne Done");

                
        System.out.println("SingletonEagerTest ==> instanceTwo Start");
        SingletonEager instanceTwo = SingletonEager.getInstance();
        System.out.println("SingletonEagerTest ==> instanceTwo Done");
        
                
        System.out.println("SingletonEagerTest ==> instanceOne hashCode ="+instanceOne.hashCode());
        System.out.println("SingletonEagerTest ==> instanceTwo hashCode ="+instanceOne.hashCode());
        
    }
}
