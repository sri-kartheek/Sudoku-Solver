# Sudoku Solver

This project contains a simple Java-based **Sudoku Solver** that takes an initial Sudoku board and solves it using **backtracking**.

## 🧩 Features

- Solves standard 9x9 Sudoku puzzles
- Uses recursive backtracking algorithm
- Easily customizable and extendable

## 📁 File Structure

```
SudokuSolver.java  # Main Java file with the Sudoku solving logic
```

## 🚀 How to Run

### Requirements

- Java 8 or higher

### Steps

1. Clone the repository or download the `.java` file.
2. Open a terminal and navigate to the project directory.
3. Compile the Java file:

   ```bash
   javac SudokuSolver.java
   ```

4. Run the program:

   ```bash
   java SudokuSolver
   ```

> Note: You can modify the `board` variable inside `main()` to test different puzzles.

## 🛠️ Example Input

Example of how the Sudoku board is passed:

```java
int[][] board = {
  {5, 3, 0, 0, 7, 0, 0, 0, 0},
  {6, 0, 0, 1, 9, 5, 0, 0, 0},
  {0, 9, 8, 0, 0, 0, 0, 6, 0},
  {8, 0, 0, 0, 6, 0, 0, 0, 3},
  {4, 0, 0, 8, 0, 3, 0, 0, 1},
  {7, 0, 0, 0, 2, 0, 0, 0, 6},
  {0, 6, 0, 0, 0, 0, 2, 8, 0},
  {0, 0, 0, 4, 1, 9, 0, 0, 5},
  {0, 0, 0, 0, 8, 0, 0, 7, 9}
};
```

## 📷 Output

The program prints the solved board directly to the console.

## 📜 License

This project is open source and available under the [MIT License](LICENSE).
