class Solution {
    public int[] lowerArray(int[] arr) {
        // code here
            int n = arr.length;
                  int[] res = new int[n];
                  int[] indices = new int[n];
                  int[] temp = new int[n];

                  for (int i = 0; i < n; i++) {
                      indices[i] = i;
                  }

                  mergeSort(arr, indices, temp, res, 0, n - 1);
                  return res;
              }

              void mergeSort(int[] arr, int[] indices, int[] temp,
                             int[] res, int low, int high) {
                  if (low >= high) {
                      return;
                  }

                  int mid = low + (high - low) / 2;

                  mergeSort(arr, indices, temp, res, low, mid);
                  mergeSort(arr, indices, temp, res, mid + 1, high);

                  merge(arr, indices, temp, res, low, mid, high);
              }

              void merge(int[] arr, int[] indices, int[] temp,
                         int[] res, int low, int mid, int high) {
                  int i = low;
                  int j = mid + 1;
                  int k = low;
                  int smaller = 0;

                  while (i <= mid && j <= high) {
                      if (arr[indices[j]] < arr[indices[i]]) {
                          temp[k++] = indices[j++];
                          smaller++;
                      } else {
                          res[indices[i]] += smaller;
                          temp[k++] = indices[i++];
                      }
                  }

                  while (i <= mid) {
                      res[indices[i]] += smaller;
                      temp[k++] = indices[i++];
                  }

                  while (j <= high) {
                      temp[k++] = indices[j++];
                  }

                  for (int p = low; p <= high; p++) {
                      indices[p] = temp[p];
                  }
              }
          }
