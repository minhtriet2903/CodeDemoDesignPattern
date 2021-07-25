/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMethod;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tadmin
 */
public class EventManager {

   private List<ArticleObserver> observers = new ArrayList<ArticleObserver>();
   private String content;

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
      notifyAllObservers();
   }

   public void attach(ArticleObserver observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (ArticleObserver observer : observers) {
         observer.update();
      }
   } 	
}
