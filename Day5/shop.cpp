#include <bits/stdc++.h>

using namespace std;

void getprice(deque<int> &queue, int &res, int &sum, int &i, vector<int> &nums, vector<int> &paths)
{
    if (queue.size() == 0)
    {
        if (sum > res)
            ;
        {
            res = sum;
            paths = nums;
        }
        return;
    }
    int top = queue.front();
    nums.push_back(top);
    queue.pop_front();
    sum += i * top;
    getprice(queue, res, sum, ++i, nums, paths);
    --i;
    sum -= i * top;
    queue.push_front(top);
    nums.pop_back();
    int bottom = queue.back();
    nums.push_back(bottom);
    queue.pop_back();
    sum += i * bottom;
    getprice(queue, res, sum, ++i, nums, paths);
    --i;
    sum -= i * bottom;
    queue.push_back(bottom);
    nums.pop_back();
}
int main()
{
    deque<int> queue;
    queue.push_back(5);
    queue.push_back(5);
    queue.push_back(5);
    queue.push_back(1);
    queue.push_back(1);
    queue.push_back(6);
    int res = INT_MIN;

    int sum = 0;
    int i = 1;

    vector<int> nums;
    vector<int> paths;
    getprice(queue, res, sum, i, nums, paths);

    for (int it : paths)
    {
        cout << it;
    }
    cout << " -> " << res;
}