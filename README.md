Question 1.

We have introduced two different JavaScript libraries/frameworks this semester. Explain the
differences/purposes of both


Answer 1.

The short answer would be, they work at different levels.


jQuery was built to abstract away the various browser idiosyncracies, and work with the DOM without having to add IE6 checks and so on. Over time, it developed a nice, robust API which allowed us to do a lot of things, but at its core, it is meant for dealing with the DOM, finding elements, changing UI, and so on. Think of it as working directly with nuts and bolts.


AngularJS was built as a layer on top of jQuery, to add MVC concepts to front end engineering. Instead of giving you APIs to work with DOM, AngularJS gives you data-binding, templating, custom components (similar to jQuery UI, but declarative instead of triggering through JS) and a whole lot more. Think of it as working at a higher level, with components that you can hook together, instead of directly at the nuts and bolts level.


 Additionally, AngularJS gives you structures and concepts that apply across various projects, like Controllers, Services and Directives. jQuery itself can be used in multiple (gazillion) ways to do the same thing. Thankfully, that is way less with AngularJS, which makes it easier to get into and out of projects. It offers a sane way for multiple people to contribute to the same project, without having to relearn a system from scratch.


AngularJS is built on top of jQuery, so if you include jQuery, AngularJS will use it for its own DOM manipulations. But jQuery is optional, and AngularJS has its own jQueryLite implementation which has some of the behavior of jQuery implemented as an API interface.


Question 2.

Explain the term DOM related to browsers


Answer 2.

The Document Object Model (DOM) is a cross-platform and language-independent application programming interface that treats an HTML, XHTML, or XML document as a tree structure wherein each node is an object representing a part of the document. The objects can be manipulated programmatically and any visible changes occurring as a result may then be reflected in the display of the document.


To render a document such as an HTML page, most web browsers use an internal model similar to the DOM. The nodes of every document are organized in a tree structure, called the DOM tree, with topmost node named as "Document object". When an HTML page is rendered in browsers, the browser downloads the HTML into local memory and automatically parses it to display the page on screen. The DOM is also the way JavaScript transmits the state of the browser in HTML pages.


Question 3.

Explain the Benefits from designing Single Page Applications


Answer 3.

SPA is extremely good for very responsive sites:


Server-side rendering is not as hard as it used to be with simple techniques like keeping a #hash in the URL, or more recently HTML5 pushState. With this approach the exact state of the web app is embedded in the page URL. As in GMail every time you open a mail a special hash tag is added to the URL. If copied and pasted to other browser window can open the exact same mail (provided they can authenticate). This approach maps directly to a more traditional query string, the difference is merely in the execution. With HTML5 pushState() you can eliminate the #hash and use completely classic URLs which can resolve on the server on the first request and then load via ajax on subsequent requests.


Question 4.

Explain the benefit from having a backend that exposes all data to clients via a REST-API


Answer 4.

The benefit from having a REST-API backend code is that it can be used again and again with different HTML, CSS and javascript code.
You could make 10 unique websites and stil use the same REST-API.
