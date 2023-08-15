package developer.model

import developer.type.Developer

class BackendDeveloper(
    override val name: String,
    override val language: String,
) : Developer