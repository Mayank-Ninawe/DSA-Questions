import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peekLast() > 0) {
                if (stack.peekLast() < -a) {
                    stack.pollLast();
                } else if (stack.peekLast() == -a) {
                    stack.pollLast();
                    alive = false;
                } else {
                    alive = false;
                }
            }
            if (alive) stack.addLast(a);
        }
        int[] res = new int[stack.size()];
        int i = 0;
        for (int val : stack) res[i++] = val;
        return res;
    }
}
