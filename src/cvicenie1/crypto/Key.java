/*
 * To change this license header, choose License Headers in Project Properties.  Key randomKey();
    Key changeKey();
    double getScore();
    void setScore(double score);
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.crypto;

/**
 *
 * @author illuSion
 */
public interface Key {
    Key randomKey();
    Key changeKey();
    double getScore();
    void setScore(double score);
}
