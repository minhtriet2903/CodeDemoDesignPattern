/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMethod;

/**
 *
 * @author Tadmin
 */
public class DemoMain {
    public static void main(String[] args) {
        EventManager subject = new EventManager();

      new CommentListener(subject);
      new ReactListener(subject);

      System.out.println("Bạn A ");	
      subject.setContent("Hình rất đẹp");
      System.out.println("Bạn B");	
      subject.setContent("Tốt");
        
    }
}
