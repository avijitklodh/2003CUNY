import { TestBed } from '@angular/core/testing';

import { PokesearchService } from './pokesearch.service';

describe('PokesearchService', () => {
  let service: PokesearchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PokesearchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
