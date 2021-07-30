package myplugin

import grails.plugins.*

class PluginFourGrailsPlugin extends Plugin {

    def grailsVersion = "4.0.11 > *"
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "My Plugin"
    def author = "Your name"
    def authorEmail = ""
    def description = '''\
Brief summary/description of the plugin.
'''
    def profiles = ['web']

}
