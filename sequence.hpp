#include <cstddef>
#include <functional>
#include <limits>
#include <string>

namespace algo
{
    class sequence final
    {
        sequence() {}

        template<typename T, std::size_t N, typename O>
        static void bubble_sort(T (&)[N], O);

        template<typename T>
        static void exchange(T&, T&);

        template<typename T, std::size_t N, typename O>
        static void insertion_sort(T (&)[N], O);

        template<typename T, std::size_t N>
        static void merge(T (&)[N], int, int, int, bool);

        template<typename T, std::size_t N>
        static void merge_sort(T (&)[N], int, int, bool);

        template<typename T, std::size_t N>
        static int recursive_binary_search(T (&)[N], T, int, int);

    public:

        template<typename T, std::size_t N>
        static void bubble_sort(T (&)[N], bool is_nonincreasing_order = false);
        
        template<typename T, std::size_t N>
        static void insertion_sort(T (&)[N], bool is_nonincreasing_order = false);

        template<typename T, std::size_t N>
        static int iterative_binary_search(T (&)[N], T);

        template<typename T, std::size_t N>
        static int linear_search(T (&)[N], T);

        template<typename T, std::size_t N>
        static void merge_sort(T (&)[N], bool is_nonincreasing_order = false);

        template<typename T, std::size_t N>
        static int recursive_binary_search(T (&)[N], T);

        template<typename T, std::size_t N>
        static void selection_sort(T (&)[N], bool is_nonincreasing_order = false);

        template<typename T, std::size_t N>
        static std::string to_string(T (&)[N]);
    };
}


template<typename T, std::size_t N, typename O>
void algo::sequence::bubble_sort(T (&a)[N], O compare)
{
    int j {};
    for (int i = 0; i < (N - 1); i++)
    {
        for (j = N - 1; j > i; j--)
        {
            if (compare(a[j], a[j - 1]))
            {
                exchange(a[j], a[j - 1]);
            }
        }
    }
}

template<typename T, std::size_t N>
void algo::sequence::bubble_sort(T (&a)[N], bool is_nonincreasing_order)
{
    if (is_nonincreasing_order)
    {
        bubble_sort(a, std::greater<T>());
    }
    else
    {
        bubble_sort(a, std::less<T>());
    }
}

template<typename T>
void algo::sequence::exchange(T& first, T& second)
{
    T temporary = first;
    first = second;
    second = temporary;
}

template<typename T, std::size_t N, typename O>
void algo::sequence::insertion_sort(T (&a)[N], O compare)
{
    T key {};
    int i {};
    for (int j = 1; j < N; j++)
    {
        key = a[j];
        i = j - 1;
        while ((i > -1) && compare(a[i], key))
        {
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = key;
    }
}

template<typename T, std::size_t N>
void algo::sequence::insertion_sort(T (&a)[N], bool is_nonincreasing_order)
{
    if (is_nonincreasing_order)
    {
        insertion_sort(a, std::less<T>());
    }
    else
    {
        insertion_sort(a, std::greater<T>());
    }
}

template<typename T, std::size_t N>
int algo::sequence::iterative_binary_search(T (&a)[N], T x)
{
    int low = 0;
    int high = N - 1;
    int mid {};
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (x == a[mid])
        {
            return mid;
        }
        else if (x > a[mid])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    return -1;
}

template<typename T, std::size_t N>
int algo::sequence::linear_search(T (&a)[N], T v)
{
    for (int i = 0; i < N; i++)
    {
        if (v == a[i])
        {
            return i;
        }
    }
    return -1;
}

template<typename T, std::size_t N>
void algo::sequence::merge(T (&a)[N], int p, int q, int r, bool is_nonincreasing_order)
{
    const int N1 = q - p + 1;
    const int N2 = r - q;

    T left[N1 + 1];
    T right[N2 + 1];

    int i {};
    int j {};

    for (i = 0; i < N1; i++)
    {
        left[i] = a[p + i];
    }

    for (j = 0; j < N2; j++)
    {
        right[j] = a[(q + 1) + j];
    }

    i = 0;
    j = 0;

    if (is_nonincreasing_order)
    {
        T sentinel = std::numeric_limits<T>::min();
        left[N1] = sentinel;
        right[N2] = sentinel;

        for (int k = p; k < (r + 1); k++)
        {
            if (left[i] >= right[j])
            {
                a[k] = left[i];
                i++;
            }
            else
            {
                a[k] = right[j];
                j++;
            }
        }
    }
    else /* increasing order */
    {
        T sentinel = std::numeric_limits<T>::max();
        left[N1] = sentinel;
        right[N2] = sentinel;

        for (int k = p; k < (r + 1); k++)
        {
            if (left[i] <= right[j])
            {
                a[k] = left[i];
                i++;
            }
            else
            {
                a[k] = right[j];
                j++;
            }
        }
    }
}

template<typename T, std::size_t N>
void algo::sequence::merge_sort(T (&a)[N], int p, int r, bool is_nonincreasing_order)
{
    if (p < r)
    {
        int q = (p + r) / 2;
        merge_sort(a, p, q, is_nonincreasing_order);
        merge_sort(a, (q + 1), r, is_nonincreasing_order);
        merge(a, p, q, r, is_nonincreasing_order);
    }
}

template<typename T, std::size_t N>
void algo::sequence::merge_sort(T (&a)[N], bool is_nonincreasing_order)
{
    if (is_nonincreasing_order)
    {
        merge_sort(a, 0, (N - 1), true);
    }
    else
    {
        merge_sort(a, 0, (N - 1), false);
    }
    
}

template<typename T, std::size_t N>
int algo::sequence::recursive_binary_search(T (&a)[N], T x, int low, int high)
{
    if (low > high)
    {
        return -1;
    }
    int mid = (low + high) / 2;
    if (x == a[mid])
    {
        return mid;
    }
    else if (x > a[mid])
    {
        return recursive_binary_search(a, x, (mid + 1), high);
    }
    else
    {
        return recursive_binary_search(a, x, low, (mid - 1));
    }
}

template<typename T, std::size_t N>
int algo::sequence::recursive_binary_search(T (&a)[N], T x)
{
    return recursive_binary_search(a, x, 0, (N - 1));
}

template<typename T, std::size_t N>
void algo::sequence::selection_sort(T (&a)[N], bool is_nonincreasing_order) 
{
    int j {};

    if (is_nonincreasing_order)
    {
        int largest {};
        for (int i = 0; i < (N - 1); i++)
        {
            largest = i;
            for (j = i + 1; j < N; j++)
            {
                if (a[j] > a[largest])
                {
                    largest = j;
                }
            }
            exchange(a[i], a[largest]);
        }
    }
    else
    {
        int smallest {};
        for (int i = 0; i < (N - 1); i++)
        {
            smallest = i;
            for (j = i + 1; j < N; j++)
            {
                if (a[j] < a[smallest])
                {
                    smallest = j;
                }
            }
            exchange(a[i], a[smallest]);
        }
    }
}

template<typename T, std::size_t N>
std::string algo::sequence::to_string(T (&a)[N])
{
    int comma_size = N - 1;
    std::string s("<");
    for (int i = 0; i < N; i++)
    {
        s.append(std::to_string(a[i]));
        if (comma_size > 0)
        {
            s.append(", ");
            comma_size--;
        }
    }
    s.append(">");
    return s;
}