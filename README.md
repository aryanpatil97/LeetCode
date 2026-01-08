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

