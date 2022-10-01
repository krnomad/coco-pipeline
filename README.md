# coco-pipeline

This is structured jenkins groovy pipeline.
It aims to increase the reusability of the jenkins pipeline code and flexibly extend it through a structured pipeline.

The first goal is to make this pipeline easier and more flexible to build embedded system platforms.
By linking with remote repository services such as github, bitbucket, gitlab, etc, 
it will help to more easily expand the build of embedded system platforms such as yocto and android platform(AOSP).

The code corresponding to the pipeline configuration can be referenced in the following repository.
https://github.com/krnomad/coco-pipe-config

```
.
├── src                              # main job DSL groovy 
|   └── *.groovy                     
├── test                             # unit test code
│   └── *.groovy             
└── vars
    └── *.groovy                     # Jenkins pipeline shared library vars objects
```


Link:
https://www.jenkins.io/doc/book/pipeline/syntax/
