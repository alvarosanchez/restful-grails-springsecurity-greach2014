class UrlMappings {

	static mappings = {

        "/categories"(resources:"category")

        "/games"(resources: "game") {
            "/categories"(resources:"category")
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
