#include <iostream>
#include <vector>
#include <string>
using namespace std;
class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int m = items.size();
        int count = 0;
        int p;
        if (ruleKey == "type")
            p = 0;
        else if (ruleKey == "color")
            p = 1;
        else
            p = 2;
        for (int i = 0; i < m; i++) {
            if (items[i][p] == ruleValue) {
                count++;
            }
        }
        return count;
    }
};
int main() {   
    vector<vector<string>> items = {
        {"phone", "blue", "pixel"},
        {"computer", "silver", "lenovo"},
        {"phone", "gold", "iphone"}
    };
    string ruleKey = "color";
    string ruleValue = "silver";
    Solution solution;
    int result = solution.countMatches(items, ruleKey, ruleValue);
    cout << "Number of items matching rule: " << result << endl;
    return 0;
}