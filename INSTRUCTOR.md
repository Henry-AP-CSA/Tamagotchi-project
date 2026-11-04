# Instructor Guide — Customizing This Template

Use this repo as a starting point for new AP CSA GitHub Classroom assignments.

Students do **not** need this file (it is hidden in the VS Code file explorer).

## Checklist

1. **Rename the assignment**
   - Update the title and overview in `README.md`
   - Change `<artifactId>` / `<name>` in `pom.xml` if desired
   - Update `"name"` in `.devcontainer/devcontainer.json`
   - Update `"projectName"` in `.vscode/launch.json` to match the Maven `artifactId`

2. **Write student methods**
   - Edit `src/main/java/com/csplusplus/StudentWork.java`
   - Replace the example `isEven` method with your stubs
   - Keep clear Javadoc examples for each method
   - Leave method bodies as stubs (`return false;`, `return null;`, etc.)

3. **Write tests**
   - Edit `src/test/java/com/csplusplus/StudentWorkTest.java`
   - One `@Test` method per graded behavior (or group related asserts)
   - Prefer descriptive names: `testMethodName_expectedBehavior`

4. **Update student-facing docs**
   - Fill in Overview, method table, Scoring, Constraints, Common Mistakes, Submission in `README.md`

5. **Optional policy tweaks**
   - Copilot coaching rules: `.github/copilot-instructions.md`
   - Inline AI suggestions: `.vscode/settings.json` (`github.copilot.inlineSuggest.enable`)
   - Hide extra files from students: `files.exclude` in `.vscode/settings.json`

## Verify before publishing

```bash
mvn test          # example stubs should FAIL (expected)
```

Then temporarily implement a correct solution, confirm tests pass, revert stubs, and create the GitHub Classroom assignment from this template.

## File map

| Path | Purpose |
|------|---------|
| `src/main/java/.../StudentWork.java` | Student stubs |
| `src/test/java/.../StudentWorkTest.java` | JUnit tests (read-only for students) |
| `pom.xml` | Maven + JUnit 5 |
| `.devcontainer/` | Codespaces / Dev Containers (Java 17 + Maven) |
| `.vscode/` | Editor settings, launch config, recommended extensions |
| `.github/copilot-instructions.md` | Copilot Chat coaching mode |
