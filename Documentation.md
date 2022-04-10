# Discover the API Management service
Each API consists of one or more operations, and each API can be added to one or more products

The system is made up of the following components:
- The **API gateway** is the endpoint that:
  - Accepts API calls and routes them to your backend(s)
  - Verifies API keys, JWT tokens, certificates, and other credentials
  - Enforces usage quotas and rate limits
  - Transforms your API on the fly without code modifications
  - Caches backend responses where set up
  - Logs call metadata for analytics purposes

- The **Azure portal** is the administrative interface where you set up your API program. Use it to:
  - Define or import API schema
  - Package APIs into products
  - Set up policies like quotas or transformations on the APIs
  - Get insights from analytics
  - Manage users

- The **Developer portal** serves as the main web presence for developers, where they can:
  - Read API documentation
  - Try out an API via the interactive console
  - Create an account and subscribe to get API keys
  - Access analytics on their own usage