import java.util.Arrays;
/*
 * Step 1: Count the Frequency of Each Task
 * Step 2: Calculate the Number of Chunks
 * Step 3: Try to Fill the Idle Slots
 */
public class _621_Task_Scheduler {
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }

        Arrays.sort(freq);
        int chunks = freq[25] - 1;
        int idles = n*chunks;

        for(int i = 24; i>=0; i--){
            idles -= Math.min(chunks, freq[i]);
        }

        return idles<0? tasks.length : tasks.length + idles;
    }

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tasks, 2));
    }
}
