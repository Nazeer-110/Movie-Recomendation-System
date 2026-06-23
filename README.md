# 🎬 MovieRecX

A movie storage, search, and recommendation system built to demonstrate core Data Structures and Algorithms concepts — including Hash Tables, Graphs, Heaps, and sorting techniques.

---

## 📌 Project Info

| | |
|---|---|
| **Student** | Nazeer Ahmed |
| **CMS ID** | 023-24-0152 |
| **Section** | E |
| **Group Name** | Code Crusader |
| **Course** | Data Structures |
| **Instructor** | Sir Riaz Ali Soomro |
| **Group Members** | Nazeer Ahmed |

---

## 🎯 Objectives

1. Implement a movie storage and retrieval system using DSA.
2. Demonstrate efficient searching and sorting of movies.
3. Provide movie recommendations based on similarity and ratings.
4. Practice core DSA concepts: Hash Tables, Graphs, and Heaps.

---

## 🧱 Data Structures Used

- **ArrayList** — primary storage for movie records
- **Graph (Adjacency List)** — models similarity between movies for recommendations
- **Max-Heap / Hash Table** — fast lookups and top-rated movie retrieval

---

## ✨ Features

| Feature | Description |
|---|---|
| 📥 **Add Movie** | Add new movie details (Title, Genre, Rating) to the system. |
| 🔍 **Search Movie** | Search movies by title or genre using Hash Table and Linked List. |
| 🗑️ **Delete Movie** | Remove movies from the database dynamically. |
| 🏆 **Recommend Top Movies** | Use Max-Heap to display highest-rated movies instantly. |
| 📊 **Sort Movies** | Apply Bubble Sort or Quick Sort to organize movies by title or rating. |
| 🌐 **Display All Movies** | Traverse Linked List or BST to show the complete movie collection. |

---

## ⚙️ How It Works

1. Movies are added with a title, genre, and rating, and stored in an ArrayList.
2. A Hash Table indexes movies by title/genre for fast search.
3. A Graph connects movies by genre/rating similarity to power recommendations.
4. A Max-Heap keeps the highest-rated movies accessible in constant time.
5. Sorting algorithms (Bubble Sort / Quick Sort) reorganize the collection on demand.

---

## 🚀 Getting Started

\`\`\`bash
# Clone the repository
git clone https://github.com/Nazeer-110/MovieRecX.git
cd MovieRecX

# Compile and run (update based on your language/build setup)
\`\`\`

> Update the run instructions above once your build/compile commands are finalized.

---

## 🛠️ Tech Stack

- **Language:** *Java*
- **Core Concepts:** Hash Tables, Graphs, Heaps, Sorting Algorithms

---

## 📂 Project Structure

\`\`\`
MovieRecX/
├── src/
│   ├── Movie.java          # Movie model
│   ├── MovieDatabase.java  # Core ArrayList + HashTable logic
│   ├── RecommendationGraph.java
│   ├── MaxHeap.java
│   └── Main.java
├── README.md
└── ...
\`\`\`

> Adjust this structure to match your actual file layout.

---

## 👥 Contributors

- **Nazeer Ahmed** — Code Crusader

---

## 📄 License

This project was developed for academic purposes as part of the Data Structures course.
