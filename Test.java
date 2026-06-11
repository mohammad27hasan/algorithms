import algo.Sequence;

void main() {
    byte[] bytes = {2, 3, 1, 4, 5};
    Sequence.mergeSort(bytes);
    for (var e: bytes) {
        IO.print(e + " ");
    }
}