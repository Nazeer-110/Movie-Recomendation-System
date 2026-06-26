# 🎬 MovieRecX — Movie Recommendation System

A movie storage, search, and recommendation engine built in Java demonstrating core Data Structures and Algorithms concepts — Hash Tables, Graphs, Heaps, and sorting algorithms.

## Features

| Feature | Description |
|---|---|
| Add Movie | Add new movie details (Title, Genre, Rating) |
| Search Movie | Search by title or genre using Hash Table |
| Delete Movie | Remove movies dynamically |
| Recommend Top Movies | Max-Heap displays highest-rated movies instantly |
| Sort Movies | Bubble Sort / Quick Sort by title or rating |
| Similarity Graph | Graph-based recommendations by genre similarity |

## Data Structures Used

- **ArrayList** — primary storage for movie records
- **Graph (Adjacency List)** — models similarity between movies
- **Max-Heap** — instant top-rated movie retrieval
- **Hash Table** — fast title/genre lookups
- **Sorting Algorithms** — Bubble Sort, Quick Sort

## Tech Stack

- **Language:** Java
- **Concepts:** Hash Tables, Graphs, Heaps, Sorting Algorithms

## Getting Started

```bash
git clone https://github.com/nazeer-ahmed-cs/Movie-Recommendation-System.git
cd Movie-Recommendation-System
javac src/MovieRecX.java -d out
java -cp out MovieRecX
```

## Project Structure

```
├── src/
│   └── MovieRecX.java      # Single-file: Movie model, Graph, Heap, Main
├── README.md
└── LICENSE
```

## Author

**Nazeer Ahmed** — [LinkedIn](https://linkedin.com/in/nazeer-ahmed-971382327/)

## License

MIT
