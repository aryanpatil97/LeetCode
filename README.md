# LeetCode Solutions Workspace

Repository layout and conventions

- Each problem has its own folder under either `Easy/` or `Medium + Hard/` named `Problem <number>/`.
- Preferred canonical files inside each problem folder:
  - `Description.md` — concise problem statement, approach, complexity, and edge cases.
  - `Solution.java` — single, canonical Java solution. Class should be named `Solution` with the method signature expected by LeetCode.

Why this structure
- Having a single `Solution.java` per problem lets you quickly compile and run solutions by targetting those files specifically.

Quick commands
- Compile all `Solution.java` files into the `out/` folder (script provided):

```bash
./tools/compile_solutions.sh
```

Notes and suggestions
- This repo currently contains some legacy numeric `.java` files (e.g. `120.java`) alongside `Solution.java`. The compile script only compiles `Solution.java` files so those legacy files won't cause conflicts during compilation. If you prefer to fully remove duplicates, I can move them into an `archive/` folder or rename them.

Archive
- Legacy numeric `.java` files have been moved into `archive/numeric_java/` to keep the repository clean while preserving history. If you'd like them restored or relocated, tell me where.
- If you want to run single problems locally, add a tiny test harness or I can add one per problem on request.
