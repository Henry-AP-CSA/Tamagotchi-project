# APCSA: [Assignment Title]

## Overview

[Brief description of what students will practice and build in this assignment.]

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/com/csplusplus/StudentWork.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Clone the repository (GitHub Desktop or `git clone`)
2. Open the folder in VS Code
3. Install the recommended **Extension Pack for Java** when prompted
4. Make sure JDK 17+ is installed, then open `StudentWork.java`

## What To Implement

Work in `StudentWork.java`. Implement each method described in the comments.

| Method | Description | Points |
|--------|-------------|--------|
| `isEven(int)` | Example method — replace with your real methods | 10 |

## Running Tests

### In VS Code / Codespaces

Open `StudentWorkTest.java`, then click the green play button next to a test method, or use the **Testing** sidebar (beaker icon).

### From the terminal

```bash
mvn test
```

Run a single test:

```bash
mvn -Dtest=StudentWorkTest#testIsEven_returnsTrueForEvenNumber test
```

## Scoring

[Explain how points are awarded. Example: each passing test is worth the points listed above.]

## Important Constraints

- Do **not** rename methods or change their parameter / return types.
- Do **not** edit files under `src/test` — tests are read-only.
- Use only standard Java (no external libraries unless the assignment says otherwise).

## Common Mistakes

- [e.g. Off-by-one errors in loops]
- [e.g. Returning the wrong type / forgetting a return statement]
- [e.g. Mutating a list when you should return a new one]

## Submission

[How students submit — usually: commit and push to their GitHub Classroom repository.]

## Credit

This repository template was modified from [CS-Plus-Plus](https://github.com/cs-plus-plus).
