# How to Set Up This Repo on GitHub

## Step 1 — Create repo on GitHub
1. Go to github.com/new
2. Name it: `leetcode-solutions`
3. Set to Public
4. Do NOT add README (we have one)
5. Click Create repository

## Step 2 — Push this folder
```bash
cd leetcode-solutions
git init
git add .
git commit -m "Initial setup: folder structure + first solutions"
git branch -M main
git remote add origin https://github.com/taniy8/leetcode-solutions.git
git push -u origin main
```

## Step 3 — Daily workflow (takes 2 minutes)
```bash
# After solving a problem on LeetCode, save the file in the right folder
# Then run:
git add .
git commit -m "Add: <ProblemName> (#<number>) - <Easy/Medium/Hard>"
git push
```

## Example commit messages
- `Add: TwoSum (#1) - Easy`
- `Add: NumberOfIslands (#200) - Medium`  
- `Add: LongestSubstringWithoutRepeating (#3) - Medium`

## Pro tip
Solve 1 problem daily → push → your GitHub graph stays green every day! 🟩
