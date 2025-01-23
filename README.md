# Travel Agency System

A Spring Boot-based travel agency management system that implements various design patterns and follows SOLID principles.

## Key Features
- Hotel booking management
- Event ticket booking
- User management with authentication
- Real-time event recommendations based on hotel location
- Notification system with multiple channels (Email/SMS)
- Flexible search functionality using Strategy Pattern

## Technical Highlights
- **Design Patterns**:
  - Strategy Pattern for search operations
  - Template Pattern for notifications
  - Factory Pattern for storage implementations
  
- **Architecture**:
  - Modular design with separate packages for different domains
  - Interface-based programming for loose coupling
  - In-memory and database storage implementations
  - RESTful API endpoints

- **Features**:
  - Booking management for hotels and events
  - Location-based event recommendations
  - Bulk notification system
  - Flexible storage implementations (In-memory/Database/External API)

## Technologies
- Spring Boot
- Java 17
- RESTful APIs

## Project Structure
- `hotel` - Hotel management module
- `event` - Event management module
- `user` - User management module
- `booking` - Booking operations module
- `notification` - Notification system module
- `common` - Shared components and utilities
