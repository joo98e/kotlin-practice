package developer.model

import developer.type.Developer

class FrontendDeveloper(
    override val name: String,
    override val language: String,
) : Developer {}