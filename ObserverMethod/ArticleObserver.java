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
public abstract class ArticleObserver {
    protected EventManager subject;
    public abstract void update ();
}
