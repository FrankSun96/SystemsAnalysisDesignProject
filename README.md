# SystemsAnalysisDesignProject

## Git Workflow
I will define the git workflow here for the sake of visibility.

### Branches

First ensure that we are up to date with master.
```console
git checkout master
git pull origin master
```

Create the new local branch. Note the naming convention. First the username of the person creating the branch and second a word or two to describe the branch. For example jamiemac96-android_login
```console
git checkout -b username-feature_description
```

Once the branch is created locally we can start making changes.

When we have made our changes and are ready to merge back into master 
we must ensure that master is up to date. 

```console
git checkout master
git pull
```

Now we must merge master into our feature branch, in order to bring it up to 
date with any changes made in master since we created the new branch.

```console
git checkout feature-branch
git merge master
```

If there are any merge conflicts we resolve them and merge again.

Finally we push our local feature branch to github.

```console
git push
```

After the feature branch has been added to github we can the make a 
pull request as well as request a code review.

When atleast one person has reviewed the code and any necessary 
changes have been made then we can merge the new changes into master.