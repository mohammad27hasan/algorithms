import algo.Sequence;

void main() {
    Integer[] integers = {2, 3, 1, 4, 5};
    Sequence.selectionSort(integers);
    for (var e: integers) {
        IO.print(e + " ");
    }
}