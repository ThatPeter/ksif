package cvicenie5;
import cvicenie1.crypto.Cipher;
import cvicenie1.crypto.Key;

public class HillClimbing {
    Key state;
    BigramFitness fitness;
    Cipher cipher;
    String ct;

    public HillClimbing(String ct, Cipher cipher, Key k) {
        fitness = new BigramFitness();
        this.cipher = cipher;
        this.ct = ct;
        state = k;
        double score = fitness.evaluate(state, cipher, ct);
        k.setScore(score);
    }

    public void start(int iterations) {
        for (int i = 0; i < iterations; i++) {
            Key candidate = state.changeKey();
            double score = fitness.evaluate(candidate, cipher, ct);
            candidate.setScore(score);
            if (candidate.getScore() < state.getScore()) {
                state = candidate;
            }
        }
        System.out.println("final:");
        System.out.println(state.getScore());
        System.out.println(cipher.decrypt(ct, state));
    }
}