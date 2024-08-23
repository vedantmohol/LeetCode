public class Solution
{
    public static String[] sortPeople(String[] names, int[] heights) {

        Integer idx[] = new Integer[heights.length];
        for(int i=0 ; i< heights.length ; i++)
        {
            idx[i] = i;
        }

        Arrays.sort(idx,(a,b)->heights[b]-heights[a]);

        String newNames[] = new String[names.length];
        for(int i=0 ; i< idx.length ; i++)
        {
            newNames[i] = names[idx[i]];
        }
        return newNames;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int size = s.nextInt();
        int heights[] = new int[size];
        System.out.print("Enter the height elements: ");
        for (int i=0 ; i<size ; i++)
        {
            heights[i] = s.nextInt();
        }
        String names[] = new String[size];
        System.out.print("Enter the names elements: ");
        for (int i=0 ; i<size ; i++)
        {
            names[i] = s.next();
        }
        String sorted[] = sortPeople(names,heights);
        System.out.println(Arrays.toString(sorted));
    }
}
