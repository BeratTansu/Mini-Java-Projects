import java.util.ArrayList;

public class Singers {

    private ArrayList<String> singerList = new ArrayList<>();

    public void printSingers() {
        System.out.println("There are " + singerList.size() + " singers in the list.");

        for (int i = 0; i < singerList.size(); i++) {
            System.out.println((i + 1) + ". Singer: " + singerList.get(i));
        }
    }

    public void addSinger(String name) {
        singerList.add(name);
        System.out.println("Singer list has been updated...");
    }

    public void updateSinger(String newName, int position) {
        singerList.set(position, newName);
        System.out.println("Singer list has been updated...");
    }

    public void removeSinger(int position) {
        String name = singerList.get(position);
        singerList.remove(position);

        System.out.println(name + " has been removed from the list...");
    }

    public void searchSinger(String singerName) {
        int position = singerList.indexOf(singerName);

        if (position >= 0) {
            System.out.println("Singer found!");
            System.out.println(singerName + " is at position " + (position + 1));
        } else {
            System.out.println("Singer not found!");
        }
    }
}
