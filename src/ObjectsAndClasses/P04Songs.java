package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    static class Song {
        private String typeList;
        private String name;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSongs.add(currentSong);
        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
