namespace algo
{
    namespace seq
    {
        template<typename T, std::size_t N>
        void insertion_sort(T (&a)[N], bool nonincreasing = false)
        {
            if (nonincreasing)
            {
                for (int j = 1; j < N; ++j)
                {
                    T key = a[j];
                    int i = j - 1;
                    while ((i > -1) && (a[i] < key))
                    {
                        a[i + 1] = a[i];
                        --i;
                    }
                    a[i + 1] = key;
                }
            }
            else
            {
                for (int j = 1; j < N; ++j)
                {
                    T key = a[j];
                    int i = j - 1;
                    while ((i > -1) && (a[i] > key))
                    {
                        a[i + 1] = a[i];
                        --i;
                    }
                    a[i + 1] = key;
                }
            }
        }
    }
}