#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<int> findWordsContaining(vector<string>& words, char x) {
    int n = words.size();
    vector<int> ans;
    for (int i = 0; i < n; i++) {
        string s = words[i];
        for (int j = 0; j < s.length(); j++) {
            if (s[j] == x) {
                ans.push_back(i);
                break;
            }
        }
    }
    return ans;
}

int main() {
    vector<string> words = {"apple", "banana", "orange", "grape"};
    char x = 'a';
    vector<int> result = findWordsContaining(words, x);
    cout << "Indices of words containing '" << x << "':" << endl;
    for (int index : result) {
        cout << index << " ";
    }
    cout << endl;

    return 0;
}
