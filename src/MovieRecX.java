import java.util.*;

// =======================
//      MOVIE CLASS `
// =======================
class Movie {
    String title;
    String genre;
    double rating;

    Movie(String t, String g, double r) {
        this.title = t;
        this.genre = g;
        this.rating = r;
    }

    @Override
    public String toString() {
        return String.format("%-25s | Genre: %-10s | Rating: %.1f", title, genre, rating);
    }
}

// =======================
//     MOVIE GRAPH
// =======================
class MovieGraph {
    HashMap<String, List<String>> adj = new HashMap<>();

    void addMovie(String title) {
        adj.putIfAbsent(title, new ArrayList<>());
    }

    void addEdge(String m1, String m2) {
        if(adj.containsKey(m1) && adj.containsKey(m2)) {
            adj.get(m1).add(m2);
            adj.get(m2).add(m1);
        }
    }

    List<String> getSimilar(String title) {
        return adj.getOrDefault(title, new ArrayList<>());
    }
}

// =======================
//  MOVIERECX SYSTEM
// =======================
public class MovieRecX {
    static ArrayList<Movie> movieDatabase = new ArrayList<>();
    static MovieGraph similarityGraph = new MovieGraph();
    static LinkedList<String> watchHistory = new LinkedList<>();

    // 1. ADD MOVIE
    public static void addMovie(String t, String g, double r) {
        Movie m = new Movie(t, g, r);
        movieDatabase.add(m);
        similarityGraph.addMovie(t);
    }

    // 2. DELETE MOVIE
    public static void deleteMovie(String title) {
        boolean removed = movieDatabase.removeIf(m -> m.title.equalsIgnoreCase(title));
        if (removed) {
            System.out.println(" Movie '" + title + "' removed successfully.");
        } else {
            System.out.println(" Movie not found.");
        }
    }

    // 3. RECOMMEND TOP RATED (MAX-HEAP) [cite: 99]
    public static void recommendTopRated() {
        System.out.println("\n Top Rated Movies (via Max-Heap):");
        PriorityQueue<Movie> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.rating, a.rating));
        maxHeap.addAll(movieDatabase);

        int count = 0;
        while (!maxHeap.isEmpty() && count < 5) {
            System.out.println("• " + maxHeap.poll());
            count++;
        }
    }

    // 4. SORT MOVIES (BUBBLE SORT)
    public static void sortMoviesByTitle() {
        int n = movieDatabase.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (movieDatabase.get(j).title.compareToIgnoreCase(movieDatabase.get(j + 1).title) > 0) {
                    Movie temp = movieDatabase.get(j);
                    movieDatabase.set(j, movieDatabase.get(j + 1));
                    movieDatabase.set(j + 1, temp);
                }
            }
        }
        System.out.println(" Database sorted alphabetically.");
    }
    public static void searchMovies(String query, boolean byTitle) {
        System.out.println("\n Search Results for: " + query);
        boolean found = false;

        for (Movie m : movieDatabase) {
            boolean match = byTitle ?
                    m.title.equalsIgnoreCase(query) :
                    m.genre.equalsIgnoreCase(query);

            if (match) {
                System.out.println("• " + m);
                found = true;
            }
        }
        if (!found) System.out.println(" No movies found matching that " + (byTitle ? "title" : "genre") + ".");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial Data [cite: 36]
        addMovie("Inception", "Sci-Fi", 8.8);
        addMovie("The Dark Knight", "Action", 9.0);
        addMovie("Interstellar", "Sci-Fi", 8.6);
        addMovie("The Godfather", "Crime", 9.2);
        addMovie("Pulp Fiction", "Crime", 8.9);

        similarityGraph.addEdge("Inception", "Interstellar");
        similarityGraph.addEdge("The Dark Knight", "Inception");

        while (true) {
            System.out.println("\n--- MovieRecX | Code Crusader ---\n\t Nazeer Ahmed"); // [cite: 64, 65]
            System.out.println("1. Add Movie");
            System.out.println("2. Delete Movie");
            System.out.println("3. Show Top Rated (Max-Heap)");
            System.out.println("4. Sort & Display All");
            System.out.println("5. Search ");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int ch;
            try { ch = Integer.parseInt(sc.nextLine()); } catch (Exception e) { continue; }

            switch (ch) {
                case 1:
                    System.out.print("Title: "); String t = sc.nextLine();
                    System.out.print("Genre: "); String g = sc.nextLine();
                    System.out.print("Rating: "); double r = Double.parseDouble(sc.nextLine());
                    addMovie(t, g, r);
                    break;
                case 2:
                    System.out.print("Enter Title to Delete: ");
                    deleteMovie(sc.nextLine());
                    break;
                case 3:
                    recommendTopRated();
                    break;
                case 4:
                    sortMoviesByTitle();
                    movieDatabase.forEach(m -> System.out.println(m));
                    break;
                case 5:
                    System.out.println("Search by: 1. Title  2. Genre");
                    int subCh = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter search term: ");
                    String term = sc.nextLine();
                    searchMovies(term, (subCh == 1));
                    break;
                case 6:
                    return;
            }
        }
    }
}