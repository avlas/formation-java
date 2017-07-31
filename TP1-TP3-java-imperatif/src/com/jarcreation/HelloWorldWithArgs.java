/** 
 * @author AVL
 * @version 1.0, 27/07/2017
 */

package com.jarcreation;

/* HelloWorld 
 * with arguments
 */
public class HelloWorldWithArgs {

	// the entry-point of the application
	public static void main(String[] args) {
		if (!args[0].isEmpty()) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Hello stranger !");
		}
	}
}
