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
public class ReactListener extends ArticleObserver{

   public ReactListener(EventManager subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Ai đó đã bày tỏ cảm xúc "+ subject.getContent());
    }
    
}
