WEB-INF/jsp/jspf directory
==========================

Overrides to the default page fragment files go in this directory:

* `head.jspf`: Extra content to go in the header. It is strongly recommended
*not* to add script tags here and instead use AMD modules for all code.
* `page-header.jspf`
* `page-footer.jspf`
* `analytics.jspf`

You may also want to add additional fragment variations to be referenced
from your pages.