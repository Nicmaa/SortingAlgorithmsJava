# SortingAlgorithmsJava

This Java project benchmarks various sorting algorithms by measuring their execution time for different input sizes. It allows you to compare the efficiency of several classic sorting algorithms as well as the built-in `Arrays.sort()` method.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Algorithms Included](#algorithms-included)
- [Contributing](#contributing)
- [License](#license)

## Features

- Interactive command-line interface to choose sorting algorithms.
- Measures and displays execution time in milliseconds and seconds.
- Supports a range of input sizes with customizable steps.
- Includes several classic sorting algorithms and the built-in Java `Arrays.sort()`.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/SortingAlgorithmsBenchmark.git
   cd SortingAlgorithmsBenchmark
   ```
2. Compile the project: You can compile the project using javac:
  ```bash
  javac src/*.java
  ```
3. Run the project: Run the compiled Java classes:
  ```bash
  java src.App
  ```
## Usage
After running the project, you will be prompted to select a sorting algorithm. You can choose from the following options:

selectionsort
insertsort
mergesort
bubblesort
quicksort
arrays
You will also need to specify the input size range and the step between sizes.

Example usage:
Which sorting algorithm would you like to use? [or type exit]
> quicksort
First element: 
> 1000
Last element: 
> 10000
Step: 
> 1000

QUICK SORT

SIZE:   TIME(ms)    TIME(s):
1000    2           0.002
2000    4           0.004
...

## Algorithms Included
Selection Sort: A simple comparison-based sorting algorithm.
Insertion Sort: Builds the final sorted array one item at a time.
Merge Sort: A divide-and-conquer algorithm that splits the array into halves.
Bubble Sort: A simple comparison-based algorithm that repeatedly steps through the list.
Quick Sort: A highly efficient sorting algorithm that uses partitioning.
Arrays.sort(): Java’s built-in sort, typically implemented as a dual-pivot quicksort.

## Contributing
Contributions are welcome! If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/YourFeature)
3. Commit your Changes (git commit -m 'Add some YourFeature')
4. Push to the Branch (git push origin feature/YourFeature)
5. Open a Pull Request

## License
This project is licensed under the MIT License. See the LICENSE file for details.
