
package BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Gita");
        theTree.insert(25, "Tegar");  
        theTree.insert(75, "Putri");  
        theTree.insert(12, "Desty");  
        theTree.insert(37, "Kiki");  
        theTree.insert(43, "arkhan");  
        theTree.insert(30, "aisyah");  
        theTree.insert(33, "rara");  
        theTree.insert(87, "mila");  
        theTree.insert(93, "fia");  
        theTree.insert(97, "gitok");   
        
        while(true){
            System.out.print("Enter first letter of show, " + "insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice){
                case 's' :
                    theTree.displaytree();
                    break;
                    
                case 'i' :
                    System.out.print("Enter value and data to" + "insert : ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break; 
                case 'd':
                    System.out.print("Enter value to delete : ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete){
                        System.out.print("Delete " + value);
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
    
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0); 
    }
    
    public static int getInt() throws IOException  {
        String s = getString();
        return Integer.parseInt(s);
    }
}
